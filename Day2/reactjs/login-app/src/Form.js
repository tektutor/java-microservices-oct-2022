import { useState } from "react";

export default function Form() {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const [submitted, setSubmitted] = useState(false);
    const [error,setError] = useState(false);

    return (
        <div className="form">
            <div>
                <h1>Login Page</h1>
            </div>

            <form>
                <label className='label'>Username</label>
                <input className='input' type="text" />

                <label className='label'>Password</label>
                <input className='input' type="text" />

                <button className="btn" type="submit">Login</button>
            </form>
        </div>
    )
}