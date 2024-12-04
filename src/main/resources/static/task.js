document.getElementById('inputSave').addEventListener('click', () => {
    const title = document.getElementById('title').value
    const modePrepare = document.getElementById('modePrepare').value
    const ingredients = document.getElementById('ingredients').value

    const task = {
        title: title,
        modePrepare: modePrepare,
        ingredients: ingredients
    }

    fetch('http://localhost:8080/tasks/saveTask', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(task)
    })
        .then(response => {
            if(!response.ok){
                throw new Error('erro na requisição' + response.statusText)
            } else {
                window.alert('Requisição enviada com sucesso!')
            }
        })

})

document.getElementById('addReceitas').addEventListener('click', () => {
    fetch('http://localhost:8080/adicionarReceitas', {
        method: 'GET',
    })
})


