<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      UIC B
    </div>
    <div class="card-body">
      <p>종목: {{ message.name.value }}</p>
      <p>현재가: {{ message.stock.value.currentPrice }}</p>
      <p>거래량: {{ message.stock.value.tradingVolume }}</p>
      <!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->


    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
// 자바스크립트를 작성
import { inject } from 'vue';

const message = inject("message");

function changeState() {
  message.stock.value = "ㅇㄴㄹㄴ"
}

</script>

<style scoped></style>