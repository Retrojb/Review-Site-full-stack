console.log('poop')

let xhttp = new XMLHttpRequest()

xhttp.onreadystatechange = function() {
	if (this.readyState == 4 && this.status == 200) {
		
		document.getElementById('newTag').innerHTML = xhttp.responseText
		
		
	}
}

xhttp.open('GET', '../tags.html', true)

xhttp.send()