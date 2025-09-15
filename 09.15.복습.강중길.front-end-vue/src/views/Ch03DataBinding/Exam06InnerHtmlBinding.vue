<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
inner html binding
    </div>
    <div class="card-body">
      <div v-html="innerHtml"></div>
      <hr/>

      <buttom class="btn btn-info btn-sm" @click="changeState()">내용 변경</buttom>

    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref } from 'vue';

  // 자바스크립트를 작성
  const innerHtml = ref("");

  innerHtml.value = "<img src='/image/photo1.jpg' height='150'/>"

  const toggle = ref(true);

  function changeState() {
    if(toggle.value) {
    innerHtml.value = "<img src='/image/photo2.jpg' height='250'/>"
    innerHtml.value += "<img src='/image/photo3.jpg' height='250'/>"
    } else {
      innerHtml.value = "<img src='/image/photo1.jpg' height='250'/>"
    }
    toggle.value = !toggle.value;
  }

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>