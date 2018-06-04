import React ,{Component} from 'react';


class TareasForm extends Component{
     constructor(){
        super();
        this.state={            
            title:'',
            responsive:'',
            description:'',
            priority:'low'
        };
         this.handleInputChange = this.handleInputChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    }
    
    handleSubmit(e){
       e.preventDefault();
        this.props.onAddTarea(this.state);
        this.setState({
      title: '',
      responsive: '',
      description: '',
      priority: 'low'
    });
  }
    
    handleInputChange(e){
        
       const {value,name}=e.target;
      this.setState({
          [name]:value
      });  
        console.log(this.state);
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
                  value={this.state.responsive}
                  onchange={this.handleInputChange}
                 />
              </div>
              <div className="form-group">
                <input 
                  type="text"
                  name="description"
                  className="form-control"
                   value={this.state.description}
                  placeholder="Description"
                  onchange={this.handleInputChange}
                 />
              </div>
               <div className="form-group">
                <select
                name="priority"
                className="form-control"
                value={this.state.priority}
                onChange={this.handleInputChange}
                >
                <option>low</option>
                <option>medium</option>
                <option>high</option>
                </select>
              </div>
                <button type="submit" className="btn btn-primary">
                Save
                </button>
            </form>
          </div>
            )
        
    }    
    
}

export default TareasForm;
