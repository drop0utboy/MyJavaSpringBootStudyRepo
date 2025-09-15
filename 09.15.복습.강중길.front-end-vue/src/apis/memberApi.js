import axios from "axios";
import store from "@/store"

function memberCreate(member) {
  return axios.post("/db/member-create", member);
}

// function memberUpdate(member) {

// }

function memberLogin(loginForm) {
  return axios.post("/db/member-login", loginForm);
}

function memberInfo(mid, jwt) {


  return axios.get("/db/member-info", {
    params: {mid},
    headers: {
      "Authorization": "Bearer " + jwt
    }
  })
}

const memberApi = {
  memberCreate,
  memberLogin,
  memberInfo
};

export default memberApi;