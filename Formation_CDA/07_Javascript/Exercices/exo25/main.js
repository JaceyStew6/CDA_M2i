const emails = ["user@example.com",
"john.doe123@example.co.uk",
"alice_smith@company.net",
"bob+jones@email.org",
"contact@website.info",
"user@example",
"john.doe@.co.uk",
"alice@company@net",
"bob@jones@email.org",
"contact@website."]

const regExp = /\w+@\w+\.\w+/

const booleans = emails.map((element) => regExp.test(element))

console.log(booleans);