<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">

    </div>
    <div class="card-body">
      헬로우왈도 컴포넌트의 UI
    </div>
    <div>
      <UIComponentA/>
      <UIComponentB class="mt-3"/>
      <UIComponentC class="mt-3"/>
      <UIComponentD class="mt-3"/>
    
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import UIComponentA from '@/components/Ch02ComponentRouting/UIComponentA.vue';
import UIComponentB from '@/components/Ch02ComponentRouting/UIComponentB.vue';
import UIComponentC from '@/components/Ch02ComponentRouting/UIComponentC.vue';
import UIComponentD from './UIComponentD.vue'

  // 자바스크립트를 작성


</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>