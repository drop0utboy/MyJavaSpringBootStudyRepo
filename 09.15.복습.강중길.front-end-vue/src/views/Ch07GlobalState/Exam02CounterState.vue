<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">

    </div>
    <div class="card-body">
<!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->

 <button class='btn btn-info btn-sm' @click='changeCounter()'>카운팅</button>
 <hr/>
 <p>counts: {{ store.state.counter.number }}</p>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { useStore } from 'vuex';

  // 자바스크립트를 작성
  const store = useStore();


  function changeCounter() {
    store.commit("counter/increaseNumber")
  }

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>