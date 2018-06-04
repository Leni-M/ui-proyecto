import React ,{Component} from 'React';
import logo from '/logo.svg';
import './App.css';

class TareasForm extends Component{
     constructor(){
        super();
        this.state={            
            title:'',
            responsive:'',
            description:'',
            priority:'low'
        };
         this.handleInputChange=this.handleInputChange.bind(this);
    }
    
    handleInputChange(e){
        
       const {value,name}=e.target;
      this.setState({
          [name]:value
      })  
        console.log(this.state);
    }
    
    handleSubmit(e){
       e.preventDefault();
        this.props.onAddTarea(this.state);
        console.lo('sending')
    }
    
    render(){
      return(
          <div className="card">
            <form className="card-body" onSubmit={this.handleSubmit}>
              <div className="form-group">
                <input 
                  type="text"
                  name="title"
                  onChange={this.handleIntputChange}
                  className="form-control"
                  placeholder="Title"
                 />
              </div>
              <div className="form-group">
                <input 
                  type="text"
                  name="responsive"
                  className="form-control"
                  placeholder="Responsive"
                  onchange={this.handleInputChange}
                 />
              </div>
              <div className="form-group">
                <input 
                  type="text"
                  name="description"
                  className="form-control"
                  placeholder="Description"
                  onchange={this.handleInputChange}
                 />
              </div>
               <div className="form-group">
                <select
                name="priority"
                className="form-control"
                onChange={this.handleInputChange}
                />
              </div>
            </form>
          </div>
      )
        
    }    
    
}

export default TareasForm;