
//this needs to be changed to a let variable instead of VAR
var xhr = new XMLHttpRequest()

xhr.onreadystatechange = function() {
	if (this.readyState == 4 && this.responseText == 200) {
		document.getElementById('newTag').innerHTML = xhr.responseText;
	}
}
xhr.open("GET", '../tag.html', true);
//setInterval(function(){
xhr.send()
