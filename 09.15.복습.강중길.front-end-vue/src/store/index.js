import { createStore } from 'vuex'
import counter from './counter';
import axiosConfig from "@/apis/axiosConfig"

const store = createStore({
  state: {
    user: "",
    jwt: ""
  },
  getters: {
    getUser(state, getters, rootState, rootGetters) {
      return state.user;

    },
    getJwt(state, getters, rootState, rootGetters) {
      return state.jwt;
    }

    // getUser: function() {} 이렇게 만들어도 됨
  },
  mutations: {
    setUser(state, payload) { // payload: {name: "xxx"}
      state.user = payload;
    },
    setJwt(state, payload) { // payload: {name: "xxx"}
      state.jwt = payload;
    }
  },
  actions: {
    loginAction(context, payload) {
      new Promise( (resolve, reject)=> {
        // 비동기 작업
        // 성공
        console.log("payload:", payload)
        // payload: {mid:"user2", mpassword:"12345"}
        resolve({result:"success", user: payload.mid});
        // 실패
        reject({result:"fail", user: payload.mpassword});
      })
      .then(data=> {
        console.log(data);
        context.commit("setUser", data.user);
      })
      .catch(error=>{console.log(error)});
      
    },

    saveAuth(context, payload) {
      // 전역 state에 저장
      context.commit("setUser", payload.mid);
      context.commit("setJwt", payload.jwt);

      // loacl storage에 저장(브라우저 재시작할 때 유지)
      localStorage.setItem("user", payload.mid);
      localStorage.setItem("jwt", payload.jwt);

      //Axios의 공통 헤더로 Authorization 추가
      axiosConfig.addAuthHeader(payload.jwt);


      // SessionStorage.setItem("user", payload.mid); 이렇게 하면 세션에 저장이 됨
    },

    removeAuth(context, payload) {
      // 전역 state 삭제
      context.commit("setUser", "");
      context.commit("setJwt", "");

      // loacl storage 삭제
      localStorage.setItem("user", "");
      localStorage.setItem("jwt", "");

      localStorage.removeItem("user");
      localStorage.removeItem("jwt");

       //Axios의 공통 헤더로 Authorization 제거
      axiosConfig.removeAuthHeader();
    },

    loadAuth(context, payload) {
      const user = localStorage.getItem("user") || "";
      const jwt = localStorage.getItem("jwt") || "";

      context.commit("setUser", user);
      context.commit("setJwt", jwt);
    }


  },
  modules: {
    counter

  }
})

export default store;