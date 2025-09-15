<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      Ex05 Attrbinding
    </div>
    <div class="card-body">
      <div class="mb-4">
        <a :href="vueHome" class="me-3">뷰 홈피</a>
        <router-link :to="appHome">애플리케이션 홈페이지</router-link>
      </div>

      <div class="mb-4">
        <img :src="'/image/' + imgFile" height="150" class="me-2">
        <img :src="`/image/${imgFile}`" height="150" class="me-2">
      </div>

      <div class="mb-4">
        <div class="mb-3 fw-bold">아름다운 풍경</div>
        <div :class="['mb-3', 'fw-bold']">아름다운 풍경</div>
        <div :class="['mb-3', className1]">아름다운 풍경</div>
        <div :class="{'mb-3':true, 'fw=bold':isClassName1}">아름다운 풍경</div> 속성의 이름은 변수로 할 수 없다.
      </div>

      <div class="mb-4">
        <div style="margin-bottom: 10px; font-weight: bold;"> 아름다운 풍경 </div>
        <div style="margin-bottom: 10px; font-weight: bold;"> 아름다운 풍경 </div>
        <div :style="[style1, style2]"> 아름다운 풍경</div>
        <div :style="{'margin-bottom':'10px', 'font-weight':fontWeight}"> 아름다운 풍경</div>
      </div>

    <hr/>

    <buttom class="btn btn-info btn-sm" @click="changeState()"> 바꾸기 </buttom>

    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref } from 'vue';

// 자바스크립트를 작성
const vueHome = ref("https://vuejs.org"); // vueHome 변수를 state, 상태로
const appHome = ref("/");
const imgFile = ref("photo1.jpg");
const className1 = ref("fw-bold");
const isClassName1 = ref(true);

const style1 = ref("margin-bottom: 10px");
const style2 = ref("font-weight: bold");
const fontWeight = ref("bold")

function changeState() {
  imgFile.value = "photo3.jpg"
  isClassName1.value = false;

}


</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>