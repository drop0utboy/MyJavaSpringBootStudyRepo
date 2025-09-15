<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      Exam04Props
    </div>
    <div class="card-body">
      <!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->
      <UIComponentA class="bg-info" 
      style="color:red" 
      :attr1="1" 
      :attr2="{ name: '홍길동', age: 25 }" 
      :attr3="['블랙', '레드', '블루']" 
      :attr4="() => { console.log('attr4함수'); }" />
      
      <hr/>

       <UIComponentB @customEvent1 ="handleCustomEvent1" @customEvent2="handleCustomEvent2"/>
    </div>

    
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import UIComponentB from './UIComponentB.vue';
import UIComponentA from './UIComponentA.vue';

function handleCustomEvent1() {
  console.log("handleCustomEvent1() 실행");
}

function handleCustomEvent2(arg1, arg2) {
  console.log("handleCustomEvent2() 실행");
  console.log("arg1:", arg1);
  console.log("arg2:", arg2);

}

// 자바스크립트를 작성

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>