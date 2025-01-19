import {ref} from "vue";
const getData = () => {
    const articles = ref([]),
            error = ref(null),
            load = async () => {
                try{
                    let response = await fetch("http://localhost:3000/articles");
                    if(!response.ok)
                        throw Error("cannot get data");
                    articles.value = await response.json();
                }catch(e){
                    error.value = e.message;
                    alert(error.value);
                }
            };
    return {articles, error, load};
};
export default getData;