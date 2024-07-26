import { useEffect, useRef } from "react";
import { useDispatch, useSelector } from "react-redux";
import { useParams } from "react-router-dom";
import { fetchCandidates } from './candidateSlice';


const CandidateList = () => {
    const dispatch = useDispatch();
    const candidates = useSelector((state) => state.candidates.candidates);

    useEffect(() => {
        dispatch(fetchCandidates());
    }, []);

    console.log(candidates);

return (
    <>
    <p>Candidate List</p>
    <div className='row'>
  
            {candidates.map(candidate => (
                <div className='col-sm-3' style={{ marginBottom: '1rem', marginTop: '1rem' }} key={candidate.id}>
                    <p>{candidate.name}</p>
                    <p>{candidate.identificationNumber}</p>
                    <p>{candidate.address}</p>
                </div>
            ))}
        </div>
    </>
);
};

export default CandidateList;