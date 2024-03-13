import { StyleSheet, Text, View } from 'react-native'
import React, { useState, useEffect } from 'react'
import Boutons from './Boutons'

export default function Calculatrice() {

    //Value of the first number
    const [currentValue, setCurrentValue] = useState(0);
    //Value of the second number
    const [savedValue, setSavedValue] = useState(0);
    //Value of the operator
    const [operator, setOperator] = useState(null);
    //Value of the result
    const [result, setResult] = useState(0);
    

    //Fonctionnel (mais pas encore pour les nombres à virgule, ni pour les opérations successives)
    const handleNumberPressed = (number) => {
        if (currentValue != 0) {
            setCurrentValue(currentValue + number.toString());
        }
        // else if (operator === '.') {
        //     setCurrentValue(currentValue.toString() + '.' + number.toString());
        // } 
        else {
            setCurrentValue(number.toString());
        }
    }

    //Fonctionnel (mais pas encore pour les nombres à virgule, ni pour les opérations successives)
    const handleOperatorPressed = (operator) => {
        //Fonctionnel
        if (operator === 'Del') {
            setCurrentValue(currentValue.slice(0, -1));
        } 
        // else if (savedValue != '' && currentValue != 0) {
        //     setOperator(operator);
        //     setSavedValue(result);
        //     setCurrentValue(0);
        // } 
        else{
            setOperator(operator);
            setSavedValue(currentValue);
            setCurrentValue(0);
        }
    }

    //Fonctionnel
    const handleClear = () => {
        setResult(0);
        setOperator(null);
        setCurrentValue('');
        setSavedValue('');
    };


    //Fonctionnel
    const handleResult = () => {
        if (operator === '+') {
            setResult(parseFloat(savedValue) + parseFloat(currentValue));
        } else if (operator === '-') {
            setResult(parseFloat(savedValue) - parseFloat(currentValue));
        } else if (operator === 'X') {
            setResult(parseFloat(savedValue) * parseFloat(currentValue));
        } else if (operator === '/') {
            setResult(parseFloat(savedValue) / parseFloat(currentValue));
        } else if (operator === '%') {
            setResult(parseFloat(savedValue) % parseFloat(currentValue));
        } else if (operator === '^') {
            setResult(parseFloat(savedValue) ** parseFloat(currentValue));
        }
        setCurrentValue(result);
    }


    return (
        <View style={styles.container}>
            <Text style={styles.title}>Calculatrice</Text>
            <View style={styles.row}>
                {/* <Text style={styles.displayStyle}>{display}</Text> */}
                <Text style={styles.displayStyle}>C:{currentValue}</Text>
                <Text style={styles.displayStyle}>S:{savedValue}</Text>
                <Text style={styles.displayStyle}>R:{result}</Text>
            </View>


            <View style={styles.row}>
                <Boutons primary={false} primaryText={false} text="AC" onPress={() => handleClear()} />
                <Boutons primary={false} primaryText={false} text="^" onPress={() => handleOperatorPressed('^')} />
                <Boutons primary={false} primaryText={false} text="%" onPress={() => handleOperatorPressed('%')} />
                <Boutons primary={false} primaryText={false} text="/" onPress={() => handleOperatorPressed('/')} />
            </View>
            <View style={styles.row}>
                <Boutons primary={true} primaryText={true} text="7" onPress={() => handleNumberPressed(7)} />
                <Boutons primary={true} primaryText={true} text="8" onPress={() => handleNumberPressed(8)} />
                <Boutons primary={true} primaryText={true} text="9" onPress={() => handleNumberPressed(9)} />
                <Boutons primary={false} primaryText={false} text="X" onPress={() => handleOperatorPressed('X')} />
            </View>
            <View style={styles.row}>
                <Boutons primary={true} primaryText={true} text="4" onPress={() => handleNumberPressed(4)} />
                <Boutons primary={true} primaryText={true} text="5" onPress={() => handleNumberPressed(5)} />
                <Boutons primary={true} primaryText={true} text="6" onPress={() => handleNumberPressed(6)} />
                <Boutons primary={false} primaryText={false} text="-" onPress={() => handleOperatorPressed('-')} />
            </View>
            <View style={styles.row}>
                <Boutons primary={true} primaryText={true} text="1" onPress={() => handleNumberPressed(1)} />
                <Boutons primary={true} primaryText={true} text="2" onPress={() => handleNumberPressed(2)} />
                <Boutons primary={true} primaryText={true} text="3" onPress={() => handleNumberPressed(3)} />
                <Boutons primary={false} primaryText={false} text="+" onPress={() => handleOperatorPressed('+')} />
            </View>
            <View style={styles.row}>
                <Boutons primary={true} primaryText={true} text="." onPress={() => handleOperatorPressed('.')} />
                <Boutons primary={true} primaryText={true} text="0" onPress={() => handleNumberPressed(0)} />
                <Boutons primary={true} primaryText={true} text="Del" onPress={() => handleOperatorPressed('Del')} />
                <Boutons primary={false} primaryText={false} text="=" onPress={() => handleResult()} />
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    title: {
        color: 'white',
        fontSize: 30,
        fontWeight: 'bold',
        textAlign: 'center',
        marginTop: 20,
        marginBottom: 130,
    },
    row: {
        flexDirection: 'row',
    },
    displayStyle: {
        color: 'grey',
        fontSize: 70,
        textAlign: 'right',
        margin: 20,
    },
})