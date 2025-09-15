<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">

    </div>
    <div class="card-body">
      <p :class="props.class">배경색 적용</p>
      <p :style="props.style">글자색 적용</p>
      <p> attr1: {{ props.attr1 }} </p>

      <p> name: {{ props.attr2.name }} </p>
      <p> age: {{ props.attr2.age }} </p>


      <ul>
        <li v-for="(item, index) in props.attr3" :key="index">{{ item }}</li>
      </ul>

      <button class="btn btn-info, btn-sm" @click="props.attr4">btn</button>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
// 자바스크립트를 작성
import { defineProps } from "vue";

const props = defineProps(["class", "style", "attr1", "attr2", "attr3", "attr4"]);
</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>