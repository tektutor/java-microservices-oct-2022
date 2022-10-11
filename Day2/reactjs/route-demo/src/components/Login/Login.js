import React, { useState } from 'react';
import PropTypes from 'prop-types';

async function loginUser(credentials) {
    return fetch('http://localhost:8080/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(credentials)
        }
    ).then ( data => data.json() )
}

export default function Login( { updateToken } ) {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [submitted, setSubmitted] = useState(false);
    const [error,setError] = useState(false);
    
    const handleUsername = (e) => {
        setUsername( e.target.value );
        setSubmitted(false);
    }

    const handlePassword = (e) => {
        setPassword( e.target.value );
        setSubmitted(false);
    }

    const errorMessage = () => {
        return (
            <div className="error"
            style={{ 
                display: error ? '': 'none'
            }}>
            <h1>Please enter username and password</h1>
            </div>
        );
    }

    const successMessage = () => {
        return (
            <div className="success"
            style={{ 
                display: submitted ? '': 'none'
            }}>
            <h1>User {username} successfully logged in !</h1>
            </div>
        );
    }

    const handleSubmit = async e => {
        e.preventDefault();

        if ( username === '' || password === '' ) {
            setError(true);
            console.log( 'Username :' + username );
            console.log('Password : ' + password );
        } else {
            //success path
            setSubmitted(true);
            setError(false);
            const tokenReceived = await loginUser( {username, password} );
            updateToken(tokenReceived); //This will invoke setToken and pass token from server
            console.log( 'Username :' + username );
            console.log('Password : ' + password );
            console.log(tokenReceived.token);
        }
    }

    return (
        <div className='form'>
            <div>
                <h1>Login Page</h1>
            </div>

            <div className="messages">
                {errorMessage()}
                {successMessage()}
            </div>

            <form>
                <label>
                    <p>Username</p>
                    <input type="text" onChange={handleUsername}></input>
                </label>

                <label>
                    <p>Password</p>
                    <input type="password" onChange={handlePassword}></input>
                </label>

                <div>
                    <button type="submit" onClick={handleSubmit}>Submit</button>
                </div>
            </form>
        </div>
    );
}

Login.propTypes = {
    updateToken: PropTypes.func.isRequired
}