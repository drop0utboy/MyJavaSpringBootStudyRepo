<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      computed function binding
    </div>
    <div class="card-body">
      <p>이름: {{ name }}</p>
      <p>주민번호: {{ getSsn() }}</p>
      <p>주민번호: {{ computedSsn }}</p>
      <hr/>
      <button class="btn btn-danger btn-sm me-2" @click="changeName">이름만 수정</button>
      <button class="btn btn-danger btn-sm" @click="changeSsn">주민번호 수정</button>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { computed, ref } from 'vue';

// 자바스크립트를 작성
let name = ref("hong");
let ssn1 = ref("123456");
let ssn2 = ref("1234567");

function getSsn() {
  console.log("getSsn() 실행");
  const ssn = ssn1.value + "-" + ssn2.value.charAt(0) + "******";
  return ssn;
}

const computedSsn = computed(() => {
  console.log("computedSsn() 실행");
  const ssn = ssn1.value + "-" + ssn2.value.charAt(0) + "******";
  return ssn;
});

function changeName() {
  name.value = "고길동";
}

function changeSsn() {
  ssn2.value = parseInt(Math.random()*4 + 1) + "23456";
}

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>