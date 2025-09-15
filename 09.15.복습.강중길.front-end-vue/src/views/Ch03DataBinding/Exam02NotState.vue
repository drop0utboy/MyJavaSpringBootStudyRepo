<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      Ex01 Expressions
    </div>
    <div class="card-body">
      <p>번호: {{ no }}</p>
      <p>이름: {{ name + "-" + company }}</p>
      <p>번호: {{ detail.info }}</p>
      <p>번호: {{ (detail.sale)? "판매":"품절" }}</p>
      <p>번호: {{ getPrice() }}</p>
    </div>

    <button class="btn btn-info btn-sm" @click="fun1()"> 변수 값 수정</button>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref } from 'vue';
  // 자바스크립트를 작성
  let no = 1;
  let name = "미니백";
  let company = "클레인";
  let detail = {
    info: "시그너츠 Cycle Lock 마그네틱 클로저가 특징입니다",
    sales: "Falls"
  }

  let price = ref(100000);

  function getPrice() {
    return price.value;
  }

  function fun1() {
    company.value = "구찌"
  }
</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>