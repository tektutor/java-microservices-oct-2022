import React, {useState} from 'react';
import {BrowserRouter,Route,Routes} from 'react-router-dom';
import Dashboard from '../Dashboard/Dashboard';
import Preferences from '../Preferences/Preferences';
import Settings from '../Settings/Settings';
import Login from '../Login/Login';

function App() {
    const [token, setToken] = useState();

    if (!token) {
        return <Login updateToken={setToken} />
    }

    return (
        <div className="wrapper">
            <h1>Application</h1>
            <BrowserRouter>
                <Routes>
                    <Route exact path="/dashboard" element={<Dashboard/>} />
                    <Route exact path="/preferences" element={<Preferences/>} />
                    <Route exact path="/settings" element={<Settings/>} />
                </Routes>
            </BrowserRouter>
        </div>
    );
}

export default App;