import {createRouter, createWebHistory} from "vue-router";
import HomeView from "../views/HomeView.vue";

const routes = [
    {
        path: "/home",
        name: "home",
        component: HomeView
    },
    {
        path: "/about",
        name: "about",
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () => import("../views/AboutView.vue")
    },
    {
        path: "/figure",
        name: "figure",
        component: () => import("../views/Figure/Figure.vue")
    },
    {
        path: "/figure/:id",
        name: "figureProfile",
        component: () => import("../views/Figure/FigureProfile.vue"),
        props: true
    },
    //redirect
    {
        path: "/candidate",
        redirect: "/figure"
    },
    //catchall
    {
        path: "/:catchAll(.*)",
        name: "notFound",
        component: () => import("../views/NotFound.vue")
    }
];

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
});

export default router;