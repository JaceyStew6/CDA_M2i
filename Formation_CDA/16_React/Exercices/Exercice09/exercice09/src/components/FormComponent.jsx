import React from 'react';

const FormComponent = () => {


    //Déclaration des variables à récupérer dans les inputs
    const titleRef = useRef("")
    const descriptionRef = useRef("")
    const platformRef = useRef("")

    //Fonction d'ajout d'un jeu video dans la base avec récupération des variables précédentes, stockées dans un objet
    function addVideoGame() {
        let videoGame = { title: titleRef.current.value, description: descriptionRef.current.value, platform: platformRef.current.value } //on utilise la syntaxe .current.value pour récupérer la valeur d'une variable avec useRef
        getValuesFromInputs(videoGame) //prend en paramètre l'objet videoGame qui permet de stocker les variables dans le tableau games déclaré dans App.js
    }


    return (
        <>
            <div >
                <h2>Add Video Game</h2>
                <hr />
                <form onSubmit={addVideoGame}>
                    {/* input title */}
                    <label htmlFor="title">Title</label>
                    <input type="text" name="title" id="title" ref={titleRef} />
                    {/* input description */}
                    <label htmlFor="description">Description</label>
                    <input type="textarea" name="description" id="description" ref={descriptionRef} />
                    {/* input platform */}
                    <label htmlFor="platform">platform</label>
                    <input type="date" name="platform" id="platform" ref={platformRef} />
                    {/* bouton d'ajout de tâche dans la to do */}
                    <button>Submit</button>
                </form>
            </div>
        </>
    );
}

export default FormComponent;