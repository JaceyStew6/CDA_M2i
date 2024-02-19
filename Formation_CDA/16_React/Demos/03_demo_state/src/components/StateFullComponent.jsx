import React from 'react';
import { PureComponent } from 'react';

class StateFullComponent extends PureComponent {
  constructor(props) {
    super(props);
    this.state = { 
      monPrenom: "Toto"
     }
  }

  changePrenom() {
    this.setState(previousState => ({...previousState, monPrenom: "Titi"}))
  }

  render() { 
    return ( 
      <div>
        <h1>StateFullComponent</h1>
        <p>mon prénom : {this.state.monPrenom}</p>
        <button onClick={this.changePrenom.bind(this)}>ChangePrenom</button>
      </div>
     );
  }
}
 
export default StateFullComponent;