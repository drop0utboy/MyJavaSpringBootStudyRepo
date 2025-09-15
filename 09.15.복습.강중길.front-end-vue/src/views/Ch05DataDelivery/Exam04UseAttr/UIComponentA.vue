<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      UIC A
    </div>
    <div class="card-body">
<!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->

      <p :class="attrs.class">배경색 적용</p>
      <p :style="attrs.style">글자색 적용</p>
      <p> attr1: {{ attrs.attr1 }} </p>

      <p> name: {{ attrs.attr2.name }} </p>
      <p> age: {{ attrs.attr2.age }} </p>

      
        <ul>
          <li v-for="(item, index) in attrs.attr3" :key="index">{{ item }}</li>
        </ul>
      
      <p><button class="btn btn-info, btn-sm" @click="attrs.attr4">btn</button></p>

    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
  // 자바스크립트를 작성
  import { defineOptions, useAttrs } from 'vue';

  defineOptions({
    //Fallthrough 기능을 비활성화
    inheritAttrs: false
  });

  const attrs = useAttrs();

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>