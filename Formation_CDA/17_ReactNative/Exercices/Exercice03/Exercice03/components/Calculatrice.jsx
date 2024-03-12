import { StyleSheet, Text, View } from 'react-native'
import React from 'react'

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
        if (operator) {
            setSecondNumber(secondNumber ? secondNumber + number : number);
        } else {
            setFirstNumber(firstNumber ? firstNumber + number : number);
        }
    }

    const handleOperatorPressed = (operator) => {
        setOperator(operator);
    }



    return (
        <View>
            <Text>Calculatrice</Text>

            <View>
                
            </View>
        </View>
    )
}

const styles = StyleSheet.create({})