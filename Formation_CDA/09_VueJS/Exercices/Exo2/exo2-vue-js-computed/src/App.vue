<script setup>
import { ref, computed } from 'vue';

class Person {
  firstname;
  lastname;
  birthdate;

  constructor(firstname, lastname, birthdate) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthdate = birthdate;
  }
};

const ellie = new Person("Ellie", "Williams", "27/09/2000");
let birthDate = ref(Person.birthDate.value);

let calculAge = computed(() => {

  return Math.abs((new Date(Date.now() - birthDate.getTime()).getUTCFullYear()) - 1970);
}

  // let today = new Date();
  // let birthDate = ref(Person.birthDate.value);
  // let year=birthDate.substr(6,4);
  // let month=birthDate.substr(3,2);
  // let day= birthDate.substr(0,2);



  // let age = today.getFullYear() - birthDate.getFullYear();
  // let m = today.getMonth() - birthDate.getMonth();
  // if (m < 0 || (m === 0 && today.getDate()< birthDate.getDate()))
  //   age -= 1;
)


</script>

<template></template>

<style scoped></style>


