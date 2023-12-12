
let moive = {
           name : "Dhadakebaj",
           director : "Mahesh Kothare",
           cast : {
                    hero : ["Lakshya","Mahesh Kothare"],
                    heroine : ["abcd","pqrs"],
                    vilan : ["asdf","adsdf"],
                    comedian : "Lakshya"
                },
            DoRelease : "17/04/1995",
            budget : "80 laks",
            kid : "true"  
}

console.log(moive)
console.log(moive.name)
console.log(moive.director)
console.log(moive.cast)

for(let i=0;i<2;i++)
{
    console.log(moive.cast.hero[i])

}




