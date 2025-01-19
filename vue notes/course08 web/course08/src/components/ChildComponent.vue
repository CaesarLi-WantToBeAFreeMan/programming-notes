<template>
    <div v-for = "article in modifiedArticles" :key = "article.title" id = "body">
        <h1 class = "titles">{{article.title}}</h1>
        <p class = "texts">{{article.paragraph}}</p>
    </div>
</template>

<script>
    import {computed, onBeforeMount} from "vue";
    export default{
        name: "ChildComponent",
        props: {articles: Array},
        setup(props){
            const modifiedArticles = computed(() => {
                return props.articles.map(article => ({
                    title: article.title + "TITLE",
                    paragraph: article.paragraph + "PARAGRAPH"
                }));
            });
            onBeforeMount(() => console.log("this is before mount moment"));
            return {modifiedArticles};
        }
    };
</script>

<style scoped>
    #body{
        background-color: rgba(12, 21, 120, 0.5);
        border: 1px solid white;
        border-radius: 50px;
        margin: 10px auto;
        width: 70%;
    }
</style>