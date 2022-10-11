const express = require('express');
const cors = require('cors');
const app = express();

app.use(cors());

app.use('/login', (req, res) => {
    res.send({
      token: 'test12345'
    });
});

app.listen(8080, () => console.log('API is running @ http://localhost:8080/login'));
