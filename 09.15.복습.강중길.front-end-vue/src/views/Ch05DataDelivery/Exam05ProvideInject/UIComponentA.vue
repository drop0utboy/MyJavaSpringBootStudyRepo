<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      UIC A
    </div>
    <div class="card-body">
      <button class='btn btn-info btn-sm' @click='changeState()'></button>
      <hr/>
      <p>종목: {{ message.name.value }}</p>
      <p>현재가: {{ message.stock.value.currentPrice }}</p>
      <p>거래량: {{ message.stock.value.tradingVolume }}</p>

      <UIComponentC/>
<!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->

      
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
  // 자바스크립트를 작성
  import { inject } from 'vue';

import UIComponentC from './UIComponentC.vue';

  const message = inject("message");
  
</script>

<style scoped> 

</style>