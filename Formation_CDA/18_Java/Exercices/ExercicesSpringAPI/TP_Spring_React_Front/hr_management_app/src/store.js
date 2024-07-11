import { configureStore } from '@reduxjs/toolkit'
import candidateReducer from './components/candidate/candidateSlice.js'

export default configureStore({
    reducer: {
        candidates: candidateReducer
    }
})
