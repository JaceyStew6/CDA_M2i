<script setup>

</script>

<template>

        <form action="#" method="post" class="form-contact">
            <div class="form-contact-lastname">
                <label for="lastname">Nom</label>
                <input type="text" placeholder="Votre nom" name="lastname" id="lastname" required />
            </div>
            <div class="form-contact-firstname">
                <label for="firstname">Prénom</label>
                <input type="text" placeholder="Votre prénom" name="firstname" id="firstname" required />
            </div>
            <div class="form-contact-email">
                <label for="email">Email</label>
                <input type="email" placeholder="Votre email" name="email" id="email" required />
            </div>
            <div>
                <label for="demande">Objet de votre demande:</label>
                <select name="demande" id="demande" required>
                    <option value="informations">Informations</option>
                    <option value="reservation">Réserver une séance</option>
                    <option value="carte-cadeau">Offrir une carte cadeau</option>
                </select>
            </div>
            <div>
                <textarea name="description" rows="10" cols="40" required>
                    Formulez votre demande ici
                </textarea>
            </div>
            <div class="form-contact-submit">
                <input type="submit" value="Envoyer!" />
            </div>
        </form>

</template>

<style scoped>


</style>