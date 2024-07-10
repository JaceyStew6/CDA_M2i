import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from "axios";

const BASE_URL = "http://localhost:8080/api/candidates";

export const fetchCandidates = createAsyncThunk(
    "candidat/fetchCandidates",
    async () => {
        const response = await axios.get(BASE_URL);
        const data = await response.data.results;

        const candidates = [];

        await Promise.all(
            data.map(async (candidate)=> {
                await axios.get(candidate.url).then((response)=>{
                    candidate.push(response.data);
                });
            })
        );
        return candidates;
    }
);

export const fetchCandidate = createAsyncThunk(
    "candidate/fetchCandidate",
    async (url) => {
        const response = await axios.get(url);
        const data = await response.data;
        return data;
    }
);

const candidateSlice = createSlice({
    name: "candidate",
    initialState:{
        candidates: [],
        error: null,
        isLoading: false,
    },
    reducers: {},
    extraReducers: (builder) => {
        builder
            .addCase(fetchCandidatesAction.pending, (state) => {
                state.isLoading = true;
                state.error = null;
                state.candidates = [];
            })
            .addCase(fetchCandidatesAction.fulfilled, (state, action) => {
                state.isLoading = false;
                state.candidates = action.payload;
            })
            .addCase(fetchCandidatesAction.rejected, (state, action) => {
                state.isLoading = false;
                state.error = action.error.message;
            });
    }
});

export default candidateSlice.reducer;