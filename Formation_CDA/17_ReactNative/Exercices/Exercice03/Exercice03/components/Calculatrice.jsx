import { StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import Boutons from './Boutons'

export default function Calculatrice() {

    //Display value of the calculator
    const [display, setDisplay] = useState(0);
    //Value of the first number
    const [firstNumber, setFirstNumber] = useState();
    //Value of the second number
    const [secondNumber, setSecondNumber] = useState();
    //Value of the operator
    const [operator, setOperator] = useState(null);
    //Value of the result
    const [result, setResult] = useState(null);

    const handleNumberPressed = (number) => {
        if (display === 0) {
            setDisplay(number.toString());
        } else {
            setDisplay(display + number);
        }
    }

    const handleOperatorPressed = (operator) => {
        setOperator(operator);
        setFirstNumber(display);
        setDisplay(0);
    }

    const handleResult = () => {
        setSecondNumber(display);
        if (operator === '+') {
            setResult(parseFloat(firstNumber) + parseFloat(secondNumber));
        } else if (operator === '-') {
            setResult(parseFloat(firstNumber) - parseFloat(secondNumber));
        } else if (operator === 'X') {
            setResult(parseFloat(firstNumber) * parseFloat(secondNumber));
        } else if (operator === '/') {
            setResult(parseFloat(firstNumber) / parseFloat(secondNumber));
        } else if (operator === '%') {
            setResult(parseFloat(firstNumber) % parseFloat(secondNumber));
        } else if (operator === '^') {
            setResult(parseFloat(firstNumber) ** parseFloat(secondNumber));
        }
        setDisplay(result);
    }







    return (
        <View style={styles.container}>
            <Text style={styles.title}>Calculatrice</Text>
            <View>
                <Text style={styles.displayStyle}>{display}</Text>
            </View>


            <View style={styles.row}>
                <Boutons primary={false} primaryText={false} text="AC" onPress={() => handleOperatorPressed('AC')} />
                <Boutons primary={false} primaryText={false} text="^" onPress={() => handleOperatorPressed('^')} />
                <Boutons primary={false} primaryText={false} text="%" onPress={() => handleOperatorPressed('%')} />
                <Boutons primary={false} primaryText={false} text="/" onPress={() => handleOperatorPressed('/')} />
            </View>
            <View style={styles.row}>
                <Boutons primary={true} primaryText={true} text="7" onPress={() => handleNumberPressed('7')} />
                <Boutons primary={true} primaryText={true} text="8" onPress={() => handleNumberPressed('8')} />
                <Boutons primary={true} primaryText={true} text="9" onPress={() => handleNumberPressed('9')} />
                <Boutons primary={false} primaryText={false} text="X" onPress={() => handleOperatorPressed('X')} />
            </View>
            <View style={styles.row}>
                <Boutons primary={true} primaryText={true} text="4" onPress={() => handleNumberPressed('4')} />
                <Boutons primary={true} primaryText={true} text="5" onPress={() => handleNumberPressed('5')} />
                <Boutons primary={true} primaryText={true} text="6" onPress={() => handleNumberPressed('6')} />
                <Boutons primary={false} primaryText={false} text="-" onPress={() => handleOperatorPressed('-')} />
            </View>
            <View style={styles.row}>
                <Boutons primary={true} primaryText={true} text="1" onPress={() => handleNumberPressed('1')} />
                <Boutons primary={true} primaryText={true} text="2" onPress={() => handleNumberPressed('2')} />
                <Boutons primary={true} primaryText={true} text="3" onPress={() => handleNumberPressed('3')} />
                <Boutons primary={false} primaryText={false} text="+" onPress={() => handleOperatorPressed('+')} />
            </View>
            <View style={styles.row}>
                <Boutons primary={true} primaryText={true} text="." onPress={() => handleOperatorPressed('.')} />
                <Boutons primary={true} primaryText={true} text="0" onPress={() => handleNumberPressed('0')} />
                <Boutons primary={true} primaryText={true} text="Del" onPress={() => handleOperatorPressed('Del')} />
                <Boutons primary={false} primaryText={false} text="=" onPress={() => handleOperatorPressed('=')} />
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