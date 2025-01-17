import {createRouter, createWebHistory} from "vue-router"
import Home from "../views/Home.vue"

const routes = [
    {
        path: "/",
        name: "home",
        component: Home
    },
    {
        path: "/create",
        name: "create",
        component: () => import("../views/Create.vue")
    },
    {
        path: "/read",
        name: "read",
        component: () => import("../views/Read.vue")
    },
    {
        path: "/update",
        name: "update",
        component: () => import("../views/Update.vue")
    },
    {
        path: "/delete",
        name: "delete",
        component: () => import("../views/Delete.vue")
    },
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