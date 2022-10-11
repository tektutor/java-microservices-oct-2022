import { useState } from "react";

export default function Form() {
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

    const handleSubmit = (e) => {
        e.preventDefault();
        if ( username === '' || password === '' ) {
            setError(true);
        } else {
            //success path
            setSubmitted(true);
            setError(false);
        }
    }


    return (
        <div className="form">
            <div>
                <h1>Login Page</h1>
            </div>

            <div className="messages">
                {errorMessage()}
                {successMessage()}
            </div>

            <form>
                <label className='label'>Username</label>
                <input onChange={handleUsername} className='input' value={username} type="text" />

                <label className='label'>Password</label>
                <input onChange={handlePassword} className='input' value={password} type="password" />

                <button onClick={handleSubmit} className="btn" type="submit">Login</button>
            </form>
        </div>
    )
}