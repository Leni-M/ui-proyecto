import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

//data
import {tareas} from './tasks.json';

//subcomponentes
import TareasForm from './components/TareasForm';


class App extends Component {
    constructor(){
        super();
        this.state={            
            tareas
            
        };
        this.handleAddTarea = this.handleAddTarea.bind(this);
    }
    
    removeTarea(index){
        this.setState({
            tareas: this.state.tareas.filter((e,i) =>{
              return i!==index   
                
            })
        });
    }
    
    removeTareaO(index){
        if(window.confirm('Are you sure yout bant '+index)) {
           this.setState({
               tareas:this.state.tareas.filter((e,i)=>{
                return i!==index                
             })
                                               
           })
        }
    }
    
    editTarea(index){
         this.setState({
            tareas: this.state.tareas.filter((e,i) =>{
              return i!==index   
                
            })
        });
    }
    
    handleAddTarea(tarea){
        this.setState({
            tareas:[...this.state.tareas,tarea]
        })
    }
    
    handleEditTarea(tarea){
         this.setState({
            tareas:[...this.state.tareas,tarea]
        })
        
        
    }

  render() {
     const tareas= this.state.tareas.map((tarea,i)=>{
         return(
            <div className="col-md-4" key={i}>
             <div className="card mt-4">
                 <div className="card-title text-center">
                    <h3>{tarea.title}</h3>
                    <span className="badge badge-pill badge-danger ml-2">
                        {tarea.priority}
                    </span>
                 </div>
                 <div className="card-body">
                    <p>{tarea.description}</p> 
                    <p><mark>{tarea.responsive}</mark></p>
                 </div>
                 <div className="card-footer">
                      <button
                        className="btn btn-danger"
                        onClick={this.removeTareaO.bind(this, i)}>
                        Delete
                      </button>
                      <button
                        className="btn btn-info ml-2"
                        onClick={this.editTarea.bind(this, i)}>
                        >
                        Editar
                      </button>
                  </div>
             </div>
            </div>
         )         
     });
      

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
        
        
                <div className="col-md-4 text-center">
                    <img src={logo} className="App-logo" alt="logo" />
                    <TareasForm onAddTarea={this.handleAddTarea}/>
                    
                </div>
        
                <div className="col-md-8">
                  <div className="row">
                  {tareas}
                  </div>
                </div>
          </div>
        </div>
      </div>
    );
  }
}
export default App;
