import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

import {tareas} from './tasks.json';

console.log(tareas);

class App extends Component {
    constructor(){
        super();
        this.state={            
            tareas
        }
    }
    

  render() {
     const tasksAll= this.state.tareas.map((tarea,i)=>{
         return(
            <div className="card">
             {tarea.title}
            </div>
         )
         
     })
      
    return (
        <div className="App">
         <nav className="navbar navbar-dark bg-dark">
            <a href="" className="text-white">
                Tasks
            </a>     
         </nav>
            {tasksAll}
         <img src={logo} className="App-logo" alt="logo" />

      </div>
    
    );        
   
  }
}

export default App;
