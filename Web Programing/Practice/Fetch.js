fetch("https://github.com/Shrilatat/CDAC-hbad2025/blob/f868de8f218b2e51d2ed37ff163c93ca7f585c79/WT-PPT-for%20participants-part2.pdf")
//fetch give promise i will give so need to cunsume
.then(response => response.json())
.then(data => console.log(data))