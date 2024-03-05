// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
const firebaseConfig = {
    apiKey: "AIzaSyCOSuEiru67fhwkyjZ3FmjkpE7sS4bmlqY",
    authDomain: "cda-m2i-d98ce.firebaseapp.com",
    databaseURL: "https://cda-m2i-d98ce-default-rtdb.europe-west1.firebasedatabase.app",
    projectId: "cda-m2i-d98ce",
    storageBucket: "cda-m2i-d98ce.appspot.com",
    messagingSenderId: "835725518007",
    appId: "1:835725518007:web:96919fd88af9e94b6a5932"
};

export const BASE_DB_URL = firebaseConfig.databaseUrl;

export const SIGN_UP_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=${firebaseConfig.apiKey}`
export const SIGN_IN_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=${firebaseConfig.apiKey}`


// Initialize Firebase
const app = initializeApp(firebaseConfig);