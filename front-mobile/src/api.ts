import axios from "axios";

const API_URL = 'https://stti-delivery.herokuapp.com';

export function fetchOrders() {
    return axios(`${API_URL}/orders`);
   
}