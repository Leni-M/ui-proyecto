import React from 'react';
import ReactDOM from 'react-dom';/*biblioteca app web*/

import './index.css';

import App from './App';
import registerServiceWorker from './registerServiceWorker';/*simulate data web local*/

ReactDOM.render(<App />, document.getElementById('root'));
registerServiceWorker();/*usar el importado*/
