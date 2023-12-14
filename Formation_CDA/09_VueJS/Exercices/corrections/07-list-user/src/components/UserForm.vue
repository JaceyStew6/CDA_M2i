<template>
  <div class="user-form">
      <form class="mb-4" @submit.prevent="submitUser">
          <div class="form-group">
              <label for="name">Name</label>
              <input 
                  ref="first"
                  type="text" 
                  class="form-control" 
                  v-model="user.name"
                  @focus="clearStatus"
                  @keypress="clearStatus"
              />
          </div>
          <div class="form-group">
              <label for="email">Email</label>
              <input 
                  type="email" 
                  class="form-control" 
                  v-model="user.email"
                  @focus="clearStatus"
                  @keypress="clearStatus"
              />
          </div>
          <div v-if="error && submitting" class="alert alert-danger">
              Please fill out all required fields
          </div>
          <div v-if="success" class="alert alert-success">
              User successfully added
          </div>
          <button class="btn btn-primary my-4">Add User</button>
      </form>
  </div>
</template>

<script setup>
import { ref, computed, onUnmounted } from 'vue'

const submitting = ref(false)
const error = ref(false)
const success = ref(false)
const user = ref({
  name: '',
  email: ''
})
let successTimeout = null
const invalidName = computed(() => user.value.name === '')
const invalidEmail = computed(() => user.value.email === '')
const emit = defineEmits(['add-user'])



const submitUser = () => {
  submitting.value = true
  clearStatus()

  if(invalidName.value || invalidEmail.value) {
      error.value = true
      return
  }

  emit('add-user', user.value)
  user.value = { name: '', email: '' }
  error.value = false
  success.value = true
  submitting.value = false

  if (successTimeout) clearTimeout(successTimeout)
  successTimeout = setTimeout(() => {
      success.value = false
  }, 2000)

}

const clearStatus = () => {
  error.value = false
  success.value = false
  if (successTimeout) {
      clearTimeout(successTimeout)
      successTimeout = null
  }
}


onUnmounted(() => {
  console.log()
  if (successTimeout) clearTimeout(successTimeout)
})


</script>

<style>

</style>

