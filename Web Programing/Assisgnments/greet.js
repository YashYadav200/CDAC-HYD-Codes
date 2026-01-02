function greet(){
    const now = new Date()

    let ampm = now.getHours() >= 12 ? `pm` : `am`
    console.log(ampm)
}
greet()