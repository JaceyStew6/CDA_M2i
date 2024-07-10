import { configureStore } from '@reduxjs/toolkit'
import candidateReducer from './components/candidate/candidateSlice'

export default configureStore({
    reducer: {
        candidates: candidateReducer,
    }
})
