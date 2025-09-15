<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">

    </div>
    <div class="card-body">

      <button class='btn btn-info btn-sm' @click='changeState()'>바꾸기</button>
      <!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->
      <UIComponentA />

      <hr />

      <UIComponentB />
    </div>
    



  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref, provide } from 'vue';
import UIComponentA from './UIComponentA.vue';
import UIComponentB from './UIComponentB.vue';

const name = ref("삼성전자");

const stock = ref({
  ticker: "005930",
  currentPrice: 70000,
  tradingVolume: 128000
});


function changeState() {
  stock.value = {
    ticker: "004170",
    currentPrice: 177000,
    tradingVolume: 9999
  }
  name.value = "신세계"
}

//Provide
provide("message", { name: name, stock: stock });


</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>