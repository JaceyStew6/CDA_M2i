import React from 'react';
import ChildComponent from './ChildComponent';

const MultiplicationComponent = () => {

    let initialValue = 10;

    return (
        <div>
            <ChildComponent initialValue={initialValue}/>
        </div>
    );
}

export default MultiplicationComponent;