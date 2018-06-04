import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

import {tareas} from './tasks.json';



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
            <div className="col-md-4">
             <div className="card mt-4">
                 <div className="card-header">
                    <h3>{tarea.title}</h3>
                    <span className="badge badge-pill badge-danger ml-2">
                        {tarea.priority}
                    </span>
                 </div>
                 <div className="card-body">
                    <p>{tarea.description}</p>
                    <p><mark>{tarea.responsive}</mark></p>
                 </div>
             </div>
            </div>
         )
         
     })
      
    return (
        <div className="App">
             <nav className="navbar navbar-dark bg-dark">
                <a href="" className="text-white">
                    Tasks
                    <span className="badge badge-pill badge-light ml-2">
                        {this.state.tareas.length}
                    </span>
                </a>     
             </nav>
             <div className="container">
              <div className="row mt-4">
                {tasksAll}
              </div>
             </div>
        
         <img src={logo} className="App-logo" alt="logo" />

      </div>
    
    );        
   
  }
}

export default App;
