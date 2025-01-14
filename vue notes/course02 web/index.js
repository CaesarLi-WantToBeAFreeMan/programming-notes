setTimeout(() =>{
    const app = Vue.createApp({
        data(){
            return{
                title: "initial title",
                size: 21,
                text: "please type something",
                degree: "none",
                fruits: [
                    "apples",
                    "bananas",
                    "oranges",
                    "grapes",
                    "pineapples",
                    "coconuts",
                    "blueberries",
                    "strawberries",
                    "mangos",
                    "lemons",
                    "pears",
                    "watermelons",
                    "peaches",
                    "cherries"
                ],
                toggleStatus: true,
                toggleMessage: "hide",
                helloText: "please click the button to change the content",
                letter: 'a',
                helloCaesar: "Hello Caesar James LEE",
                age: 18,
                htmlContent: `
                    <div>
                        <ul>
                            <li>first item</li>
                            <li>second item</li>
                            <li>third item</li>
                        </ul>
                    </div>
                `,
                isLikeTeslaCybertruck: true
            };
        },
        methods:{
            changeTitle(title){
                this.title = "Hello " + title;
            },
            increaseFont(){
                this.size++;
            },
            decreaseFont(){
                if(this.size > 1)
                    this.size--;
            },
            toggleButton(){
                this.toggleStatus = !this.toggleStatus;
                this.toggleMessage = this.toggleStatus ? "hide" : "show";
            },
            nextLetter(){
                if(this.letter < 'z')
                    this.letter = String.fromCharCode(this.letter.charCodeAt(0) + 1);
                else
                    this.letter = 'a';
            }
        },
        computed:{
            LikeOrHateTeslaCyberTruckButton(){
                return this.isLikeTeslaCybertruck ? "hate" : "like";
            },
            LikeOrHateTeslaCyberTruckMessage(){
                return this.isLikeTeslaCybertruck ? "you like tesla cybertruck" : "you hate tesla cybertruck";
            }
        }
    });
    app.mount("#app");
}, 1200);