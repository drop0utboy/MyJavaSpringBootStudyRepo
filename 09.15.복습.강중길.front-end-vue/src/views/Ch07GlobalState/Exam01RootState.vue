<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">

    </div>
    <div class="card-body">
<!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->
 <button class='btn btn-info btn-sm' @click='changeUser()'>user변경</button>
 <button class='btn btn-info btn-sm' @click='callAction()'>Action호출</button>
 <hr/>
 <p>user: {{ store.state.user }}</p>
 <p>user: {{ $store.state.user }}</p>
 <p>user: {{ store.getters.getUser }}</p>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
  // 자바스크립트를 작성
  import { useStore } from 'vuex';

  const store = useStore();

  function changeUser() {
    //전역 상태값 변경
    store.commit("setUser", "user1"); // 여기서의 "user1" 값이 payload가 된다
  }

  function callAction() {
    store.dispatch("loginAction", {mid:"user03", mpassword:"12313141"})
  }

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>