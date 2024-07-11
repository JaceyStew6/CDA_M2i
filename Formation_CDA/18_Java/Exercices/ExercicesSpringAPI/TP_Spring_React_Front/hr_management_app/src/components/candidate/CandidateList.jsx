import { useRef } from "react";
import { useDispatch, useSelector } from "react-redux";


const CandidateList = () => {
    const dispatch = useDispatch();
    // const typeRef = useRef();
    const candidates = useSelector((state) => state.candidates.candidates)


return (
    <>
    <p>Candidate List</p>
    <div className={classes.cardContainer}>
    {candidates.map((candidate, key) => (
        <p candidate={candidate} key={key} index={candidate.id} />
    ))} 
    </div>
    </>
);
};

export default CandidateList;
