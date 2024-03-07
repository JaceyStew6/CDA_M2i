import { createSlice } from '@reduxjs/toolkit'

const albumSlice = createSlice({
    name: "album",
    initialState: {
        albums: []
    },

    reducers: {
        setAlbum:(state, action) => {
            state.albums = action.payload
        }
    }
})