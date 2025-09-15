const counter = {
  namespaced: true, 

  state: {
    number: 0
  },
  getters: {
    getNumber(state, getters, rootState, rootGetters) {
      return state.number;
    }
  },
  mutations: {
    increaseNumber(state, payload) {
      state.number += 1;
    }
  },
  actions: {
  }
}

export default counter;